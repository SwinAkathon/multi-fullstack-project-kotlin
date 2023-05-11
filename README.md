# gradle-multi-fullstack-project

Language: `Kotlin`

## Overview

There are 3 sub pjojects.

* `shared`: shared components
* `frontend`: frontend project
* `backend`: backend project

Project dependencies: 
```
frontend -- depends on ---> shared
backend -- depends on ---> shared
```

## How to build

Build all sub projects.

```bash
$ ./gradlew build
```

Build `shared` project only.

```bash
$ ./gradlew :shared:build
```

## How to test

Run test for all sub projects.

```bash
$ ./gradlew --info cleanTest test
```

## References

* https://guides.gradle.org/creating-multi-project-builds/
* https://docs.gradle.org/current/userguide/intro_multi_project_builds.html
* https://github.com/embulk/embulk
