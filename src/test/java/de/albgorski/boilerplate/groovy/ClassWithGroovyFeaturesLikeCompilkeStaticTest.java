package de.albgorski.boilerplate.groovy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class ClassWithGroovyFeaturesLikeCompilkeStaticTest {

  private final static Logger LOGGER = LoggerFactory.getLogger(ClassWithGroovyFeaturesLikeCompilkeStatic.class);

  private ClassWithGroovyFeaturesLikeCompilkeStatic testerObject;

  @BeforeMethod
  void setUp() {
    testerObject = new ClassWithGroovyFeaturesLikeCompilkeStatic();
  }

  @Test
  public void testNothingJustItCompiles() {
    Object check;
    try {
      check = testerObject.getName("input");
    } catch (RuntimeException runtime) {
      // look ClassWithGroovyFeaturesLikeCompilkeStatic
      // to force a runtime exception
      LOGGER.error("RUNTIME EXCEPTION (compilation was OK)", runtime);
      throw runtime;
    }

    assertThat(check).isNotNull();
    assertThat(check).isEqualTo("success input");
  }
}
