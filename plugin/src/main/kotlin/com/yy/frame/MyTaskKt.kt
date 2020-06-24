package com.yy.frame

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.File

/**
 * Created by binlly on 2020/6/23-20:13
 *
 * @author binlly >_
 *     _                                           ____  _       _ _
 *    / \__      _____  ___  ___  _ __ ___   ___  | __ )(_)_ __ | | |_   _
 *   / _ \ \ /\ / / _ \/ __|/ _ \| '_ ` _ \ / _ \ |  _ \| | '_ \| | | | | |
 *  / ___ \ V  V /  __/\__ \ (_) | | | | | |  __/ | |_) | | | | | | | |_| |
 * /_/   \_\_/\_/ \___||___/\___/|_| |_| |_|\___| |____/|_|_| |_|_|_|\__, |
 *                                                                   |___/
 */
open class MyTaskKt: DefaultTask() {

    @Input
    var title: String? = "我是小白"

    @Input
    var age = 18

    @OutputDirectory
    var destDir: File? = null

    @TaskAction
    fun action() {
        println("Kotlin task is run! $title <=> $age")
    }

}