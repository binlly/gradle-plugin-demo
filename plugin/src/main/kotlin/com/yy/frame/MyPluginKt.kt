package com.yy.frame

import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * Created by binlly on 2020/6/17-17:11
 *
 * @author binlly*     _                                           ____  _       _ _
 *    / \__      _____  ___  ___  _ __ ___   ___  | __ )(_)_ __ | | |_   _
 *   / _ \ \ /\ / / _ \/ __|/ _ \| '_ ` _ \ / _ \ |  _ \| | '_ \| | | | | |
 *  / ___ \ V  V /  __/\__ \ (_) | | | | | |  __/ | |_) | | | | | | | |_| |
 * /_/   \_\_/\_/ \___||___/\___/|_| |_| |_|\___| |____/|_|_| |_|_|_|\__, |
 *                                                                   |___/
 */

class MyPluginKt: Plugin<Project> {

    override fun apply(project: Project) {
        println("apply my plugin kt")
        // project.tasks.create("myTask", MyTask::class.java)
        project.tasks.create("myTaskKt", MyTaskKt::class.java)
    }
}
