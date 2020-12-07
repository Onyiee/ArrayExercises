package myDiary;

import java.time.LocalDateTime;

public class Entry {
    private String entryTitle;
    private LocalDateTime entryDateAndTime;
    private String entryBody;

    public Entry(String entryTitle) {
        this.entryTitle = entryTitle;
        entryDateAndTime = LocalDateTime.now();
    }

    public void setEntryTitle(String newEntryTitle) {
        this.entryTitle = newEntryTitle;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEntryDateAndTime() {
        return entryDateAndTime;
    }

    public void setEntryBody(String newEntryBody) {
        this.entryBody = newEntryBody;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public String viewEntry() {
        String actual = ("Title: " + getEntryTitle() + "\n"
                        + "Entry Date: " + getEntryDateAndTime()
                        .toLocalDate() + "\n"
                        + "Entry Body: " + getEntryBody()
                    );
        return actual;
    }

    @Override
    public String toString(){
        return viewEntry();
    }
}

