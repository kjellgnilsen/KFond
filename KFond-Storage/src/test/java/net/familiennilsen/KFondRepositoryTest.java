package net.familiennilsen;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.familiennilsen.model.KFondBasic;

class KFondRepositoryTest {

	@Autowired
	KFondAuthorTitleRepository re;
	@Test
	void test() {
		KFondBasic kf = new KFondBasic("Kjell", "Boka");
		KFondBasic kf2 = re.save(kf);
		Assertions.assertNotNull(kf2);
		Assertions.assertEquals(kf.getAuthor(), kf2.getAuthor());
		Assertions.assertEquals(kf.getTitle(), kf2.getTitle());
		Assertions.assertNotNull(kf2.getId());
		String id = kf2.getId();
		Optional<KFondBasic> kf3 = re.findById(id);
		Assertions.assertNotNull(kf3);
		Assertions.assertEquals(id,kf3.get().getId());
		Assertions.assertEquals(kf.getAuthor(), kf3.get().getAuthor());
		Assertions.assertEquals(kf.getTitle(), kf3.get().getTitle());
		
		
		
	}

}
