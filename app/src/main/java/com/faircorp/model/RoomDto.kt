package com.faircorp.model

data class RoomDto(val roomId: Long,
                   val roomName: String,
                   val currentTemperature: Double?,
                   val targetTemperature: Double?)