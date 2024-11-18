// CameraControls.kt
package com.example.camerax.components

import androidx.camera.core.CameraSelector
import androidx.camera.view.LifecycleCameraController
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cameraswitch
import androidx.compose.material.icons.filled.FlashOff
import androidx.compose.material.icons.filled.FlashOn
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CameraControls(
    controller: LifecycleCameraController,
    isFlashOn: Boolean,
    onFlashToggle: (Boolean) -> Unit,
    onCameraSwitch: () -> Unit
) {
    Row(
        modifier = Modifier
            .padding(start = 16.dp, top = 16.dp) // Menggunakan padding untuk jarak
            .fillMaxWidth() // Menyesuaikan lebar agar elemen tidak tumpang tindih
    ) {
        // Tombol untuk mengganti kamera
        IconButton(
            onClick = onCameraSwitch
        ) {
            Icon(
                imageVector = Icons.Default.Cameraswitch,
                contentDescription = "Switch camera"
            )
        }

        // Tombol untuk mengaktifkan atau menonaktifkan flash
        IconButton(
            onClick = { onFlashToggle(!isFlashOn) }
        ) {
            Icon(
                imageVector = if (isFlashOn) Icons.Filled.FlashOn else Icons.Filled.FlashOff,
                contentDescription = "Toggle Flash"
            )
        }
    }
}

