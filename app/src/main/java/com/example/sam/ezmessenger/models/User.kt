package com.example.sam.ezmessenger.models

class User(val uid: String, val username: String, val profileImageUrl: String) {
    constructor(): this("", "", "")
}