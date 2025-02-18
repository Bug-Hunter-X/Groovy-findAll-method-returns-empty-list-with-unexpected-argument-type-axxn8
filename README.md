# Groovy findAll Method Unexpected Behavior

This repository demonstrates an unusual behavior of Groovy's `findAll` method when an unexpected type is passed as an argument.  The method unexpectedly returns an empty list instead of throwing an exception or producing a more informative error message.

## Bug Description
The `findAll` method in Groovy is intended to filter a collection based on a closure. However, when the input list contains elements of a type that is not handled correctly by the closure's condition, it silently returns an empty list.  This behavior is not clearly documented and could lead to subtle and difficult-to-debug errors.

## How to Reproduce
1. Clone this repository.
2. Run the `Bug.groovy` script using a Groovy interpreter (e.g., `groovy Bug.groovy`).
3. Observe the unexpected empty list returned by `findAll`.