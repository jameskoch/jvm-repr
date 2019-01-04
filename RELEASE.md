1. Ensure you're on master - `git checkout master && git pull`
1. Stamp a version number - `gradle release`
  a. This will prompt for a release version; just press ENTER at all prompts to select defaults.
    * To instead control via the command line: `gradle release -Prelease.useAutomaticVersion=true -Prelease.releaseVersion=1.0.0 -Prelease.newVersion=1.0.1-SNAPSHOT`
  b. This includes running of tests. TODO - CONFIRM
  c. This pushes two new commits and one new tag to github immediately.
1. Upload the release to Sonatype staging area - `gradle uploadArchives`
1. Release it into the wild - `gradle closeAndReleaseRepository`


