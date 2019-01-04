1. `git checkout master`
1. Ensure no local changes w/ `git status`
1. `mvn release:clean release:prepare`
  a. This will prompt for a release version; just press ENTER at all prompts to select defaults.
  b. This includes running of tests.
  c. This pushes two new commits and one new tag to github immediately.
1. `mvn release:perform`
  a. This uploads to the staging area of Sonatype
1. You can manually inspect if using a web GUI and the OSSRH credentials - https://central.sonatype.org/pages/releasing-the-deployment.html
1. Release th staged artifacts to Central repository using `mvn nexus-staging:release`

