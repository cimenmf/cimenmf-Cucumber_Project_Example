package com.cukeserp.step_definitions;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class NotesSteps extends BrowserUtils {
    Pages pages = new Pages();

    @Then("{string} should be able to see {string} Tag")
    public void should_be_able_to_see_Tag(String userName, String tagName) {
        Assert.assertEquals(pages.getNotesPage().notesTags_message.getAttribute("title"), tagName);
    }

    @Then("{string} should be able to see {string} Note")
    public void should_be_able_to_see_Note(String userName, String messageName) {
        Assert.assertEquals(pages.getNotesPage().notesMessage_button.getText(), messageName);
    }


    @Then("{string} should be able to see {string} Tag in Database")
    public void should_be_able_to_see_Tag_in_Database(String userName, String tagName) {
        List<Object> str = new ArrayList<>(getColumnData(NOTES_TAG_QUERY, "name"));
        Assert.assertTrue(str.toString().contains(tagName));

        for (int i = 0; i < str.size() ; i++) {
            if(str.get(i).toString().equals(tagName)){
            Assert.assertEquals(str.get(i).toString(),tagName);
            break;
            }
        }

    }

    @Then("{string} should be able to see {string} Note in Database")
    public void should_be_able_to_see_Note_in_Database(String userName, String messageName) {
        List<Object> str = new ArrayList<>(getColumnData(NOTES_MESSAGE_QUERY, "name"));
        Assert.assertTrue(str.contains(messageName));

        for (int i = 0; i < str.size() ; i++) {
            if(str.get(i).toString().equals(messageName)){
                Assert.assertEquals(str.get(i).toString(),messageName);
                break;
            }
        }
    }


}
