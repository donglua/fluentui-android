package com.microsoft.fluentui.tokenized.persona

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.microsoft.fluentui.theme.token.controlTokens.AvatarTokens
import com.microsoft.fluentui.theme.token.controlTokens.BorderInset
import com.microsoft.fluentui.theme.token.controlTokens.BorderInset.None
import com.microsoft.fluentui.theme.token.controlTokens.BorderType
import com.microsoft.fluentui.theme.token.controlTokens.BorderType.NoBorder
import com.microsoft.fluentui.theme.token.controlTokens.ListItemTokens
import com.microsoft.fluentui.tokenized.listitem.ListItem

@Composable
fun Persona(
    person: Person,
    modifier: Modifier = Modifier,
    primaryText: String,
    secondaryText: String? = null,
    tertiaryText: String? = null,
    onClick: (() -> Unit)? = null,
    border: BorderType = NoBorder,
    borderInset: BorderInset = None,
    enabled: Boolean = true,
    enableAvatarActivityRings: Boolean = false,
    enableAvatarPresence: Boolean = true,
    avatarTokens: AvatarTokens? = null,
    personaTokens: ListItemTokens? = null
) {

    var avatarSize = getAvatarSize(secondaryText, tertiaryText)
    ListItem.Item(
        text = primaryText,
        subText = secondaryText,
        secondarySubText = tertiaryText,
        onClick = onClick,
        modifier = modifier,
        border = border,
        borderInset = borderInset,
        listItemTokens = personaTokens,
        enabled = enabled,
        leadingAccessoryView = {
            Avatar(
                person = person,
                modifier = modifier,
                size = avatarSize,
                enableActivityRings = enableAvatarActivityRings,
                enablePresence = enableAvatarPresence,
                avatarToken = avatarTokens
            )
        })
}