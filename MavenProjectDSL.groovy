job('First-Maven-job-Via-DSL') {
    description("First Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github")
    scm {
        git("https://github.com/Balaji468/Jenkins_Upgradev3", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('test install', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.jar'
    }
}