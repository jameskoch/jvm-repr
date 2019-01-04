

# Configuring publishing via Travis:

## Signing

Gradle is a damn mess here; you have to ship a bunch of files, see https://medium.com/@harmittaa/travis-ci-android-example-357f6e632fc4. We should just use SBT directly.

Based on:
* https://rishikeshdarandale.github.io/build/deploying-to-oss-sonatype-using-travis/
* https://github.com/olafurpg/sbt-ci-release/blob/master/readme.md
* https://github.com/arakelian/travis-ci-gradle-deploy-skeleton
* https://medium.com/@harmittaa/travis-ci-android-example-357f6e632fc4

`gpg --gen-key`

Note the new LONG_ID for the key:
```
pub   rsa2048 2018-06-10 [SC] [expires: 2020-06-09]
      $LONG_ID
uid                      $PROJECT_NAME bot <$EMAIL>
```

`gpg --keyserver hkp://pgp.mit.edu --send-keys $LONG_ID`










OLD -----------------------------------------


1. Ensure you're on master - `git checkout master && git pull`
1. Stamp a version number - `gradle release`
  a. This will prompt for a release version; just press ENTER at all prompts to select defaults.
    * To instead control via the command line: `gradle release -Prelease.useAutomaticVersion=true -Prelease.releaseVersion=1.0.0 -Prelease.newVersion=1.0.1-SNAPSHOT`
  b. This includes running of tests. TODO - CONFIRM
  c. This pushes two new commits and one new tag to github immediately.
1. Upload the release to Sonatype staging area - `gradle uploadArchives`
1. Release it into the wild - `gradle closeAndReleaseRepository`


