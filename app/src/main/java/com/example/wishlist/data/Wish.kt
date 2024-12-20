package com.example.wishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop"),
        Wish(title = "Google Pixel 6", description = "Android Phone"),
        Wish(title = "Iphone 6", description = "IOS Phone"),
        Wish(title = "MacBook Pro", description = "IOS Laptop"),
        Wish(title = "HP Omen", description = "Windows Laptop"),
        Wish(title = "Dell G15", description = "Kali Linux Laptop")
    )
}