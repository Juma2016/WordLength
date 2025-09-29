package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsValidWordTest {
    @Test
    void testThrowIllegal(){
        assertThrows(IllegalArgumentException.class, ()->IsValidWord.checkWord(" "));
        assertThrows(IllegalArgumentException.class, ()->IsValidWord.checkWord(null));
    }
    @Test
    void testRightLength(){
        assertTrue(IsValidWord.checkWord("Mario"));
        assertTrue(IsValidWord.checkWord("HALLOW"));
    }
    @Test
    void testWrongLength(){
        assertFalse(IsValidWord.checkWord("hi"));
        assertFalse(IsValidWord.checkWord("MARIO Shenouda"));
    }
    @Test
    void testWordLength(){
        assertEquals(5, IsValidWord.lengthOfWord("Mario"));
    }
}
