package myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDiaryEntryIsSet() {
        //given
        Diary myBreakUpDiary = new Diary(5);
        //when
        int numberOfDiaryEntries = myBreakUpDiary.getNumberOfDiaryEntries();
        //assert
        assertEquals(5, numberOfDiaryEntries);

    }

    @Test
    void testDiaryEntryIsNotNull() {
        //given
        Diary myBreakUpDiary;
        //when
        myBreakUpDiary = new Diary(10);
        //assert
        Entry[] entries = myBreakUpDiary.getEntries();
        assertNotNull(entries);

    }

    @Test
    void testDiaryEntryCanBeEntered() {
//        //given
//        Diary myBreakUpDiary = new Diary(5);
//        Entry entry = new Entry("My Break Up Story");
//        entry.setEntryBody("It just happened");
//        //when
//        myBreakUpDiary.addNewEntry(entry);
//        //assert
//        assertEquals(entry,myBreakUpDiary.getEntries()[0]);
////        Entry[] assertionEntry = new Entry[5];
////        assertionEntry[0] = entry;
////        assertArrayEquals(assertionEntry, myBreakUpDiary.getEntries());
//
//        //given
//        Diary myBreakUpDiary2 = new Diary(5);
//        Entry entry2 = new Entry("My Break Up Story2");
//        entry2.setEntryBody("More of it");
//        //when
//        myBreakUpDiary2.addNewEntry(entry2);
//        //assert
//        assertEquals(entry2,myBreakUpDiary2.getEntries()[1]);

        // given
        Diary myBreakUpDiary = new Diary(5);
        Entry entry = new Entry("My Break Up Story");
        entry.setEntryBody("It just happened");
        //when
        myBreakUpDiary.addNewEntry(entry);
        //assert
        assertEquals(entry, myBreakUpDiary.getEntries()[0]);


        // given

        Entry entry2 = new Entry("My Break Up Story");
        entry2.setEntryBody("How it all began");
        //when
        myBreakUpDiary.addNewEntry(entry2);
        //assert
        assertEquals(entry2, myBreakUpDiary.getEntries()[1]);


    }
}