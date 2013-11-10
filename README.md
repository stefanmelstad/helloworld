# helloworld

## Greenqloud setup

1. Clone this repo; `git clone https://github.com/arnihermann/helloworld`
2. Run Greenqloud Xvfb setup script; `cd helloworld; bin/greenqloud_xvfb_setup`

## Selenium

Some helpful links:

* [Read the docs!]([Download the zip file](http://chromedriver.storage.googleapis.com/index.html)
* [Selenium IDE](http://www.seleniumhq.org/projects/ide/)

### Run the tests on the Greenqloud server

Greenqloud is a server, and has no display to run GUI programs like a browser. We would still like to run Selenium tests on servers, and [Xvfb](http://en.wikipedia.org/wiki/Xvfb) allows us to do just that.

To setup the requirements on the Greenqloud server, we've embedded a script in the repo. Just run:

    bin/greenqloud_xvfb_setup

This script installs Chrome and Firefox browsers, Xvfb and dependencies. It also fetches and prepares the chromedriver for us.

Now you have everything setup, simply run:

    bin/package
    bin/selenium_tests_xvfb

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



