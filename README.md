Tester
======

A highly-flexible test-running suite. It can quickly and easily be told to run tests with particular flags on, and you can specify precisely what tests you would like to run in a jiffy. For example, you can run tests `(1,52)U(58)U(75,91)` in the verbose mode on `ModuleX` by creating a script that extends `TestScript`, importing `tester.TestCriteriaDialect._`, and calling this in the body of your script: `run((1 >&> 91) && (53 >!> 74) && 58 && Talkative, ModuleX)`.

See [here](https://github.com/TheBizzle/PathFinding/blob/master/AStar/src/test/astar/BiDirAStarTest.scala) for a nice, simple example of its use.
