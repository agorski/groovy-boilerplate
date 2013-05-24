package de.albgorski.boilerplate.groovy

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

@CompileStatic
@TypeChecked
class ClassWithGroovyFeaturesLikeCompilkeStatic {

  String getName(String input) {
    String test = input
    // uncomment line below to see TypeCheckedin action
    //int worng = input

    "success $test"
  }
}
