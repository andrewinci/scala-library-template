package {{cookiecutter.organization}}

import munit.FunSuite

class IntegrationSpec extends FunSuite {
  test("dummy") {
    assertEquals(Hello.greeting, "hello")
  }
}
