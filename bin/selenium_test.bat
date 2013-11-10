@echo off
rem ***********************************************************************
rem This bat file runs Selenium tests (uses failsafe plugin).
rem ***********************************************************************

call mvn test-compile
call mvn failsafe:integration-test
