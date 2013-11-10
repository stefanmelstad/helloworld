helloworld
===

### Selenium

Some helpful links:

* [Read the docs!]([Download the zip file](http://chromedriver.storage.googleapis.com/index.html)
* [Selenium IDE](http://www.seleniumhq.org/projects/ide/)

### Selenium tests

This repo currently has two separate Selenium test classes;

1. ChromeTestTitleIT - that sets up and runs using Google Chrome (via [chromedriver](http://code.google.com/p/selenium/wiki/ChromeDriver))
2. FirefoxTestTitleIT - that runs a Selenium native WebDriver that controls Firefox

For each of these tests, you'll need to make sure you have the corresponding browser installed and accessible in your path. Depending on which OS you are running, this setup is different. 

You'll also need to have the chromedriver (see above) installed. To install chromedriver:

* On Windows:
    * [Download the zip file](http://chromedriver.storage.googleapis.com/index.html)
    * Unzip it, and place the `chromedriver.exe` file into the root of the repo (e.g. `C:\dev\public\helloworld\chromedriver.exe`)
    * In the command prompt, rename the executable: `mv chromedriver.exe chromedriver`
* On *nix:
    * [Download the zip file](http://chromedriver.storage.googleapis.com/index.html)
    * Unzip it to the root of the repo.



