package com.jakubhoryd.pages;

import com.jakubhoryd.elements.buzz.PublishNewPostMenu;
import com.jakubhoryd.elements.buzz.PublishedPostArea;

public class BuzzPage {

    public final PublishNewPostMenu publishNewPostMenu;
    public final PublishedPostArea publishedPostArea;

    public BuzzPage() {
        publishNewPostMenu = new PublishNewPostMenu();
        publishedPostArea = new PublishedPostArea();
    }
}
