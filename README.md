The demo app tests nested implementation and the correct retrieval of dependencies:
dummy-aar is implemented in dummy-module and the demo app implements only demo-module

I like to have a dedicated github repo for having all the published material in one place and add only one dependency in the settings.gradle.

Steps:
1. publish to local repository: see dummy-aar or dummy-module build.gradle files (publish)
2. create a dedicated repo for sharing the repo
3. push to the dedicated-repo

In the project:
1. add repositories{
        maven{url "https://raw.githubusercontent.com/paolovsrl/mvn-repo-public/relase"}
    }
   Syntax: "https://raw.githubusercontent.com/[username]/[dedicated-repo]/[branch]"
2. build.gradle:
   implementation "com.something:dummy-aar:1.0.0"
