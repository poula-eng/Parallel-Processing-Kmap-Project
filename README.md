# Parallel K-Means Clustering with Fork/Join

**Parallel Processing · Fall 2026 · Project 4 · Team of seven**

We are building a Java program that groups 2D points into clusters. We will run it sequentially and with Java Fork/Join, then compare runtime and clustering quality.

**First time using GitHub? Follow these steps in order. You do not need to learn Git commands first.**

## 1. Find your role

Ask the team leader which role, **M1–M7**, is yours. These are role labels; names and GitHub accounts still need to be confirmed.

| Role | Your responsibility in plain language | Your task |
|---|---|---|
| [M1 · leader](docs/ownership.md#m1-team-leader-and-integration) David E. Fam | Keep shared types consistent and connect everyone's work | [Issue #1](https://github.com/DavidGirges1/Parallel-Processing-Kmap-Project/issues/1) |
| [M2 · Beshoy Atef](docs/ownership.md#m2-sequential-algorithm-and-shared-loop) | Build the sequential algorithm and the loop both versions use | [Issue #2](https://github.com/DavidGirges1/Parallel-Processing-Kmap-Project/issues/2) |
| [AbdalluhMahmoud](docs/ownership.md#m3-parallel-assignment-with-forkjoin) | Make point assignment run in parallel with Fork/Join | [Issue #3](https://github.com/DavidGirges1/Parallel-Processing-Kmap-Project/issues/AbdalluhMahmoud) |
| [M4-AboAsal](docs/ownership.md#m4-centroid-math-stopping-and-sse) | Calculate cluster centers, stopping checks, and clustering error | [Issue #4](https://github.com/DavidGirges1/Parallel-Processing-Kmap-Project/issues/4) |
| [M5-BolaHany (DataSet)](docs/ownership.md#m5-data-and-starting-centers) | Generate sample points and choose reproducible starting centers | [Issue #5](https://github.com/DavidGirges1/Parallel-Processing-Kmap-Project/issues/5) |
| [M6 - George](docs/ownership.md#m6-complete-program-tests-and-performance) | Check the complete program and measure real performance | [Issue #6](https://github.com/DavidGirges1/Parallel-Processing-Kmap-Project/issues/6) |
| [M7](docs/ownership.md#m7-visualization-and-demo) | Draw points and centers using the Java program's results | [Issue #7](https://github.com/DavidGirges1/Parallel-Processing-Kmap-Project/issues/7) |

Open [your member checklist](docs/ownership.md) for **your folders, your first task, your dependencies, and how to know you are done**.

The leader's [contract handoff](docs/m1-handoff.md) identifies what is ready to use and what still needs integration. M1 is DavidGirges1; other member accounts remain to be confirmed.

## 2. Set up your computer once

Follow [the first-time setup guide](docs/getting-started.md):

1. Create a GitHub account and accept the repository invitation.
2. Install JDK 17, GitHub Desktop, and a Java editor.
3. Download your own working copy using **Clone**.
4. Open the project and select Java 17.
5. Run the build and check for **BUILD SUCCESS**.

The guide explains each step and gives separate Windows and macOS/Linux commands. GitHub Desktop is the suggested route for Windows/macOS. Linux users have a [command-line route](docs/command-line.md).

## 3. Start one small task

1. Read **Do this first** in [your role checklist](docs/ownership.md).
2. Open your linked issue and confirm the task with the leader.
3. Follow [Contributing](CONTRIBUTING.md) to create your own branch before editing.
4. Write a small piece of your module and tests for it.
5. Run the build before sharing your work.

M2 and M3 can start assignment while M4 and M5 work independently. See [who starts when](docs/workflow.md); you do not need to wait for the whole program to exist.

## 4. Share your work for review

1. Save a **commit**: a named checkpoint of your changes.
2. **Push** your branch: upload those commits to GitHub.
3. Open a **pull request (PR)**: ask the team to review your changes.
4. Ask another teammate to review and wait for the automated checks to pass.
5. Merge after review and checks pass, coordinating with the leader.

[Contributing](CONTRIBUTING.md) shows the Desktop/GitHub steps. Keep your task on its own branch until it is reviewed.

## What is ready, and what still needs building?

| Ready | Still team work |
|---|---|
| Java 17/Maven setup and automated checks | Sequential and parallel K-Means |
| Shared models and service interfaces | Math implementations and generated datasets |
| Model tests and a small assignment fixture | Complete-program tests and real benchmarks |
| Contribution guides and starter issues | Visualization and a runnable demo |

Foundation PR [#8](https://github.com/DavidGirges1/Parallel-Processing-Kmap-Project/pull/8) is merged. There is **no runnable clustering application yet**. A successful foundation build does not mean the assignment is finished.

## Find the right guide

| You need to… | Open this |
|---|---|
| Set up your computer or fix a setup error | [Getting started](docs/getting-started.md) |
| Know exactly what your role should do | [Member checklists](docs/ownership.md) |
| Submit your first changes | [Contributing](CONTRIBUTING.md) |
| Understand an unfamiliar word | [Glossary](docs/glossary.md) |
| Understand who depends on whom | [Team workflow](docs/workflow.md) |
| Check exact Java method signatures | [Architecture](docs/architecture.md) |
| Plan tests and measurements | [Experiments](docs/experiments.md) |
| Prepare the report, presentation, and oral | [Deliverables](docs/deliverables.md) |
| Manage invitations and branch protection | [Leader's GitHub checklist](docs/github-setup.md) |
| Check the full requirements and team agreement | [AGENTS.md](AGENTS.md) |

Every member writes tests for their own code, helps with the report/presentation, and prepares for the individual oral. Java and Fork/Join are required; Java 17/Maven/JUnit and this folder layout are team choices. No team deadline has been supplied.
