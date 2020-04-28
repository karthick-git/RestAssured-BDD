package com.qa.utils;

import org.openqa.selenium.By;

public interface IObjectRepository {
    void load(String... fileNames);
    void reset();
    By getByFromObjectRepositoryLocator(String key);
}
