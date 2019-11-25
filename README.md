<!---

TASK LIST:

  * Use cp -rf *.* to copy all of the files and directories in this repository
    to the starter repository for this assignment
  * Change into the directory for the starer repository
  * Update the header (e.g., #) to only give the name of the assignment
  * Update the first paragraph to include the commented-out content
  * Change the link in the # Problems section to point to this lab's starter
  * Create the assignment in the GitHub Classroom, noting the URL
  * Test the assignment by accepting it with your own GitHub account
  * Check to ensure that your GitHub repository is created correctly
  * Share the assignment link with all of the students using email or Slack

PROBLEMS?

  * Contact Gregory M. Kapfhammer by email or Slack
  * Raise an issue in the GitHub repository for this assignment

-->

# cs101-F2018-lab10-starter

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter for Laboratory 10 in Computer Science 101.
Since the Travis builds for this repository will initially fail (as evidenced
by a red &#x2717; appearing in the commit logs instead of a green &#x2714;),
the programmer is responsible for completing all of the steps needed to satisfy
the requirements for the assignment, thus causing a &#x2714; to instead appear
in the commit logs.

## Introduction

Please review the carefully formatted assignment sheet for this project as it
provides more details about the steps that a computer scientist should take to
complete this assignment. You can view this assignment sheet by visiting the
listing of laboratories on the course web site.

When you use the `git commit` command to transfer your source code to your
GitHub repository, [Travis CI](https://travis-ci.com/) will initialize a build
of your assignment, checking to see if it meets all of the requirements. If both
your source code and writing meet all of the established requirements, then you
will see a green &#x2714; in the listing of commits in GitHub. If your
submission does not meet the requirements, a red &#x2717; will appear instead.
The instructor will reduce a programmer's grade for this assignment if the red
&#x2717; appears on the last commit in GitHub immediately before the
assignment's due date.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides. In particular, please make sure that you have read the
following GitHub guides: [Mastering
Markdown](https://guides.github.com/features/mastering-markdown/), [Hello
World](https://guides.github.com/activities/hello-world/), and [Documenting Your
Projects on GitHub](https://guides.github.com/features/wikis/). Each of these
guides will help you to understand how to use both [GitHub](http://github.com) and
[GitHub Classroom](https://classroom.github.com/).

To do well on this assignment, you should also review all of the chapters in the
text book, including those that we will cover during the rest of the semester.
Please see the course instructor or one of the teaching assistants or tutors if
you have questions about any of these reading assignments.

## Commands

To get started in using the GatorGrader tool, you can change into the directory
for this assignment and type the command `gradle grade` in your terminal.
Running this command will produce a lot of output that you should carefully
inspect. If the output indicates that GatorGrader judges that there are no
mistakes in the assignment, then this means that your source code and writing
are passing all of the automated baseline checks. However, if the output
indicates that there are mistakes, then you will need to understand what they
are and then try to fix them.

You can also complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is a correct program) the program using the command
`gradle build`. There are also additional commands that you can type:

* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main directory for this
assignment where the `build.gradle` file is located. Then, you can type the
command in the terminal and study the output. Please note that, if your program
interacts with the user in the terminal window, you must run it differently than
you ran past programs. In this situation, you would type the following command
in your terminal window:

```
gradle -q --console plain run
```

## Checks

In addition to meeting all of the requirements outlined in the assignment
sheet, your submission must pass the following checks:

* writing/proposal.md:
  * Passes the checks performed by the Markdown linting tool
  * Passes the checks performed by the Proselint linting tool
  * Contains exactly five uses of a `##` fragment
  * Contains exactly four contiguous paragraphs of formatted text
  * Each contiguous paragraph contains at least 50 words

* writing/reflection.md:
  * Passes the checks performed by the Markdown linting tool
  * Passes the checks performed by the Proselint linting tool
  * Contains exactly three uses of a `##` fragment
  * Contains exactly three contiguous paragraphs of formatted text
  * Each contiguous paragraph contains at least 100 words

* writing/report.md:
  * Passes the checks performed by the Markdown linting tool
  * Passes the checks performed by the Proselint linting tool
  * Contains exactly three uses of a `##` fragment
  * Contains exactly three contiguous paragraphs of formatted text
  * Each contiguous paragraph contains at least 100 words

* writing/update.md:
  * Passes the checks performed by the Markdown linting tool
  * Passes the checks performed by the Proselint linting tool
  * Contains exactly two uses of a `##` fragment
  * Contains exactly two contiguous paragraphs of formatted text
  * Each contiguous paragraph contains at least 100 words

* GitHub repository:
  * Contains at least ten commits beyond the repository's starting number of commits

## Updates

If the course instructor updates the provided material for this assignment and
you would like to receive these updates, then you can type this command in the
main directory for this assignment:

```
git remote add download git@github.com:Allegheny-Computer-Science-101-F2018/cs101-F2018-lab10-starter.git
```

You should only need to type this command once; typing the command additional
times may yield an error message but will not negatively influence the state of
your repository. Now, you are ready to download the updates provided by the
course instructor by typing:

```
git pull download master
```

This second command can be run whenever the course instructor needs to provide
you with new source code for this assignment. However, please note that, if you
have edited the files that the course instructor updated, running the previous
command may lead to Git merge conflicts. If this happens, you may need to
manually resolve them with the help of the instructor or a teaching assistant.

## Travis

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run
the checking programs every time you commit to your GitHub repository. The
checking will start as soon as you have accepted the assignment, thus creating
your own private repository, and the course instructor enables Travis for it. If
you are using Travis for the first time, you will need to authorize Travis CI to
access the private repositories that you created on GitHub.

## Requirements

The GatorGrader software that supports the checking of this assignment was
developed for the following software and versions:

* Gradle 4.6
* Java 1.8.0
* MDL 0.4.0
* Proselint 0.8.0
* Python 3.6

## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 101 Lab 10
Starter](https://github.com/Allegheny-Computer-Science-101-F2018/cs101-F2018-lab10-starter)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks
you assignment, then you can follow the aforementioned steps to create an issue
in its repository. To ensure that your issue is properly resolved, please
provide as many details as is possible about the problem that you experienced.
If you discover a problem with the laboratory assignment sheet, then please
raise an issue in the
[cs101-F2018-sheets](https://github.com/Allegheny-Computer-Science-101-F2018/cs101-F2018-sheets)
repository and mention this assignment.

Students who find, and use the appropriate GitHub issue tracker to correctly
document, a mistake in any aspect of this laboratory assignment will receive
free laptop stickers and extra credit towards their grade for it.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a teaching assistant during the laboratory
session. Alternatively, you may ask questions in the Slack workspace for this
course. Finally, you can schedule a meeting during the course instructor's
office hours.
