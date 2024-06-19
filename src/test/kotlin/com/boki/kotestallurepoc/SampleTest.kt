package com.boki.kotestallurepoc

import io.kotest.core.spec.style.*
import io.kotest.matchers.shouldBe

class BehaviorSpecTest : BehaviorSpec({
    context("a broomstick should be able to be fly and come back on it's own") {
        given("a broomstick") {
            `when`("I sit on it") {
                then("I should be able to fly") {
                    // test code
                }
            }
            `when`("I throw it away") {
                then("it should come back") {
                    // test code
                }
            }
        }
    }

    given("a broomstick") {
        and("a witch") {
            `when`("The witch sits on it") {
                and("she laughs hysterically") {
                    then("She should be able to fly") {
                        // test code
                    }
                }
            }
        }
    }

    Given("1과 2가 있고") {
        val one = 1
        val two = 2

        When("1과 2를 더하면") {
            val actual = one + two

            Then("3이다.") {
                actual shouldBe 3
            }
        }
    }

    xgiven("this is disabled") {
        When("disabled by inheritance from the parent") {
            then("disabled by inheritance from its grandparent") {
                // disabled test
            }
        }
    }
    given("this is active") {
        When("this is active too") {
            xthen("this is disabled") {
                // disabled test
            }
        }
    }
})
