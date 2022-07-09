package com.arash.altafi.motionlayout.sample1.verticalstackcards

import com.arash.altafi.motionlayout.sample1.verticalstackcards.Card

data class VerticalCardModel(
    val detailCard: Card,
    val cardTop: Card,
    val cardMiddle: Card,
    val cardBottom: Card,
    val cardEnd: Card,
    val cardTransparent: Card
)
