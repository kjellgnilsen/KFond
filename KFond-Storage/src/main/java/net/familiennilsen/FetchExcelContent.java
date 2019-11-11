package net.familiennilsen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.familiennilsen.model.KFondUrl;

public class FetchExcelContent {
//	@Autowired
//	private KFondConfig kfondconfig;
		
//	List<KFondUrl> urls =  (List<KFondUrl>) env.getPropertySources().listIterator();
	List<KFondUrl> urls = null;

	public FetchExcelContent(List<KFondUrl> urls) {
		super();
		this.urls = urls;
		   
		   
	}

	public FetchExcelContent() {
		super();
	}

	public Integer getUrls() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(KFondConfig.class);

		KFondConfig f = ctx.getBean(KFondConfig.class);
		 

		if (f != null) {
			return f.getConfig().size();
		} else {
			//System.out.println(config.getServers().toString());
			return 0;
		}
	}

}
