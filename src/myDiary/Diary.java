package myDiary;

public class Diary {
    private Entry[] entries;

    public Diary( int numberOfDiaryEntries) {
        entries = new Entry[numberOfDiaryEntries];
    }

    public int getNumberOfDiaryEntries() {
        return entries.length;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry newDiaryEntry) {
//        entries[0] = newDiaryEntry;
//        entries[1] = newDiaryEntry;
            for (int i = 0; i <entries.length; i ++){
                if (entries[i] == null){
                    entries[i] = newDiaryEntry;
                    break;
                }
            }
    }
//    public void addNewEntry(Entry[] entriesArray) {
////        entries[0] = newDiaryEntry;
////        entries[1] = newDiaryEntry;
//        }
//
//    }
}
