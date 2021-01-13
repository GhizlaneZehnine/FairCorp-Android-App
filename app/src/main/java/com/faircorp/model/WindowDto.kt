package com.faircorp.model

import com.faircorp.Status

data class WindowDto(val id: Long, val name: String,  val windowStatus: Status, val roomName: String, val roomId: Long)