package analyzerTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import analyzer.MoodAnalyzer;

public class MoodAnalyzerTest {

	@Test
	public void happyMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");

		String mood = moodAnalyzer.analyzeMood();

		assertEquals("HAPPY", mood);
	}

	@Test
	public void sadMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");

		String mood = moodAnalyzer.analyzeMood();

		assertEquals("SAD", mood);
	}

	@Test
	public void anyMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in  mood");

		String mood = moodAnalyzer.analyzeMood();

		assertEquals("HAPPY", mood);
	}

}
