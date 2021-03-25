**Tasks:**

1.  Install Junit(4.12), Hamcrest(1.3), Eclemma or Jacoco(newest) in Eclipse
    (done by last lab) or IDEA (follow the new instruction).

2.  Write a java program for the given problem and test the program with
    **Advanced Junit Usage**.

    1.  Add `@Before`, `@BeforeClass`, `@After`, `@AfterClass` to
        different functions, and write logs in each function, observe the
        execution order.

    2.  Given the input list`testinput.txt`, each line with a test input and
        expected output, separated by comma, eg. `10,36` means `10 = 3 + 3 +
        4` and the result should be `3 * 3 * 4 = 36`. Each line only
        contains one test case. Use `@RunWith(Parameterized.class)` to load
        the test file, and test all test cases.

3.  Use Eclemma or Jacoco to produce coverage.

    1.  Description of the problem:

>   Given a positive integer N, split it into the sum of at least two positive
>   integers, and maximize the product of these integers. Returns the largest
>   product value M.

>   **Input:**

>   **N** a positive integer

>   **Output:**

>   **M** the largest product value

Sample Input:

10

Sample Output

>   36 (10 = 3 + 4 + 4， 3 \*3\*4 = 36)

**Requirements for the experiment:**

1.  Finish the tasks above individually.

2.  Please send your experiment report to 智慧树, the following information
    should be included in your report:

    1.  Your java code and junit test program.

    2.  The brief description that you install junit and Eclemma or Jacoco.

    3.  The test result and coverage of your tests on the problem.

