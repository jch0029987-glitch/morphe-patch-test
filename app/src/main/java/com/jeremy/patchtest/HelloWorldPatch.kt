package com.jeremy.patchtest

import android.app.Activity
import android.widget.Toast
import app.morphe.patcher.annotation.Patch
import app.morphe.patcher.patch.Patch
import app.morphe.patcher.fingerprint.MethodFingerprint

@Patch(
    name = "Jeremy Visual Test",
    description = "A visual Toast for my Pixel 7.",
    app = "com.google.android.youtube" 
)
class HelloWorldPatch : Patch() {
    override fun execute() {
        // 1. Define the fingerprint for Activity.onCreate
        val onCreateFingerprint = MethodFingerprint(
            className = "android.app.Activity",
            methodName = "onCreate",
            parameters = listOf("android.os.Bundle")
        )

        // 2. Hook into it
        patcher.hookMethod(onCreateFingerprint) {
            after { param ->
                // The 'thisObject' in onCreate is the Activity itself (a Context)
                val activity = param.thisObject as Activity
                
                // 3. Finally, show the Toast!
                Toast.makeText(activity, "Morph Patch Active: Hello Jeremy!", Toast.LENGTH_LONG).show()
            }
        }
        
        logger.info("Jeremy's Toast hook is ready!")
    }
}
