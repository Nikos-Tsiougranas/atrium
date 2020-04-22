// TODO remove file with 1.0.0
@file:Suppress("DEPRECATION", "TYPEALIAS_EXPANSION_DEPRECATION")

package ch.tutteli.atrium.verbs.expect

import ch.tutteli.atrium.creating.Assert

@Deprecated("Use expect from package verbs; will be removed with 1.0.0", ReplaceWith("ch.tutteli.atrium.verbs.expect(subject)"))
fun <T : Any> expect(subject: T)
    = ch.tutteli.atrium.verbs.expect(subject)

@Deprecated("Use expect from package verbs; will be removed with 1.0.0", ReplaceWith("ch.tutteli.atrium.verbs.expect(subject, assertionCreator)"))
fun <T : Any> expect(subject: T, assertionCreator: Assert<T>.() -> Unit)
    = ch.tutteli.atrium.verbs.expect(subject, assertionCreator)

@Deprecated("Use expect from package verbs; will be removed with 1.0.0", ReplaceWith("ch.tutteli.atrium.verbs.expect(subject)"))
fun <T : Any?> expect(subject: T)
    = ch.tutteli.atrium.verbs.expect(subject)

@Deprecated("Use expect from package verbs; will be removed with 1.0.0", ReplaceWith("ch.tutteli.atrium.verbs.expect(act)"))
fun expect(act: () -> Unit)
    = ch.tutteli.atrium.verbs.expect(act)
