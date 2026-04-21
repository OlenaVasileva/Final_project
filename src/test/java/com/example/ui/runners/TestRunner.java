package com.example.ui.runners;

import org.junit.platform.suite.api.*;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("feature")
public class TestRunner {

}