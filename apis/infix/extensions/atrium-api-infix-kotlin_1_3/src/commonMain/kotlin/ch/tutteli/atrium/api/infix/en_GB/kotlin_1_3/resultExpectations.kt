package ch.tutteli.atrium.api.infix.en_GB.kotlin_1_3

import ch.tutteli.atrium.api.infix.en_GB.aSuccess
import ch.tutteli.atrium.api.infix.en_GB.creating.SuccessWithCreator
import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.logic._logic
import ch.tutteli.atrium.logic.kotlin_1_3.isFailureOfType
import ch.tutteli.atrium.logic.kotlin_1_3.isSuccess

/**
 * Expects that the subject of `this` expectation (a [Result]) is a success ([Result.isSuccess])
 * and returns an [Expect] for the inner type [E].
 *
 * @return The newly created [Expect] if the given assertion is success.
 *
 * @since 0.17.0
 */
@Deprecated(
    "The whole kotlin_1_3 extension will be removed with 1.2.0, use the function from the ch.tutteli.atrium.api.fluent.en_GB package",
    ReplaceWith("this toBe aSuccess", "ch.tutteli.atrium.api.fluent.en_GB.toBe")
)
infix fun <E, T : Result<E>> Expect<T>.toBe(@Suppress("UNUSED_PARAMETER") aSuccess: aSuccess): Expect<E> =
    _logic.isSuccess().transform()

/**
 * Expects that the subject of `this` expectation (a [Result]) is a success ([Result.isSuccess]) and
 * that it holds all assertions the given [SuccessWithCreator.assertionCreator] creates.
 *
 * Use the function `aSuccess { ... }` to create a [SuccessWithCreator].
 *
 * @return an [Expect] for the subject of `this` expectation.
 *
 * @since 0.12.0
 */
@Deprecated(
    "The whole kotlin_1_3 extension will be removed with 1.2.0, use the function from the ch.tutteli.atrium.api.fluent.en_GB package",
    ReplaceWith("this toBe success", "ch.tutteli.atrium.api.fluent.en_GB.toBe")
)
infix fun <E, T : Result<E>> Expect<T>.toBe(success: SuccessWithCreator<E>): Expect<T> =
    _logic.isSuccess().collectAndAppend(success.assertionCreator)

/**
 * Expects that the subject of `this` expectation (a [Result]) is a failure ([Result.isFailure]) and
 * that it encapsulates an exception of type [TExpected].
 *
* @return An [Expect] with the new type [TExpected]
 *
 * @since 0.17.0
 */
@Deprecated(
    "The whole kotlin_1_3 extension will be removed with 1.2.0, use the function from the ch.tutteli.atrium.api.fluent.en_GB package",
    ReplaceWith("this.toBeAFailure<TExpected>()", "ch.tutteli.atrium.api.fluent.en_GB.toBeASuccess")
)
inline fun <reified TExpected : Throwable> Expect<out Result<*>>.toBeAFailure(): Expect<TExpected> =
    _logic.isFailureOfType(TExpected::class).transform()

/**
 * Expects that the subject of `this` expectation (a [Result]) is a failure ([Result.isFailure]) ,
 * that it encapsulates an exception of type [TExpected] and
 * that the exception holds all assertions the given [assertionCreator] creates.
 *
 * @return An [Expect] with the new type [TExpected]
 *
 * @since 0.17.0
 */
@Deprecated(
    "The whole kotlin_1_3 extension will be removed with 1.2.0, use the function from the ch.tutteli.atrium.api.fluent.en_GB package",
    ReplaceWith("this.toBeAFailure<TExpected>(assertionCreator)", "ch.tutteli.atrium.api.fluent.en_GB.toBeAFailure")
)
inline infix fun <reified TExpected : Throwable> Expect<out Result<*>>.toBeAFailure(
    noinline assertionCreator: Expect<TExpected>.() -> Unit
): Expect<TExpected> = _logic.isFailureOfType(TExpected::class).transformAndAppend(assertionCreator)
