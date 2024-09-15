package com.example.foregroundservice.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foregroundservice.R

/**
 * Composable function for displaying a single TodoItem in a list.
 */
@Composable
fun MusicItemScreen(
//    item: Song,
    onItemClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick() }
            .background(MaterialTheme.colorScheme.secondary),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ft52), // Замените на ваш ресурс изображения
            contentDescription = "Music Icon",
            modifier = Modifier
                .padding(vertical = 4.dp, horizontal = 8.dp)
                .size(48.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.primary)

        )
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = "BACK TO BACK",
                maxLines = 1,
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onPrimary,

            )
            Text(
//                    text = item.text,
                text = "FRIENDLY THUG 52 NGG",
                maxLines = 1,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.outlineVariant
            )
        }

        Image(
            painter = painterResource(id = R.drawable.baseline_more_horiz_24), // Замените на ваш ресурс изображения
            contentDescription = "Music Icon",
            modifier = Modifier
                .padding(vertical = 4.dp, horizontal = 8.dp)
                .size(24.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.primary)

        )


    }
}


//
//val exampleTodoItem = TodoItem(
//    id = "3",
//    text = "Finish project report",
//    importance = Importance.NO,
//    deadline = Date(System.currentTimeMillis() + 172800000),
//    isCompleted = false,
//    createdAt = Date(),
//    modifiedAt = null,
//    isSynced = false,
//    isModified = false,
//    isDeleted = false,
//    isUndo = false
//)


/**
 * Preview function for TodoItemScreen in light theme.
 */
//@Preview(showBackground = true)
//@Composable
//fun TodoItemScreenPreview() {
//    ForegroundServiceTheme {
//        MusicItemScreen(
//            Song(
//            mediaId = "1",
//            title = "BACK TO BACK",
//            subtitle = "FRIENDLY THUG 52 NGG",
//            songUrl = "android.resource://com.example.myapp/raw/song1",
//            imageUrl = "android.resource://com.example.myapp/raw/song1"
//        )
//        ) {
//
//        }
//    }
//}

