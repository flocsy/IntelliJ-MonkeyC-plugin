package com.github.flocsy.intellijmonkeycplugin.services

import com.github.flocsy.intellijmonkeycplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
