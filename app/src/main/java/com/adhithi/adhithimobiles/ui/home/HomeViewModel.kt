package com.adhithi.adhithimobiles.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adhithi.adhithimobiles.R

class HomeViewModel : ViewModel() {

    private val _homeDataList = MutableLiveData<MutableList<HomeDataModel>>().apply {
        var dataList = mutableListOf<HomeDataModel>()
        dataList.add(HomeDataModel("Samsung m30s", "(Black, 128 GB) (6 GB RAM) · 6 GB RAM  128 GB ROM ", R.drawable.samsungm30s))
        dataList.add(HomeDataModel("iPhone 12", "A super-powerful chip. An advanced dual‑camera system. A Ceramic Shield front that's tougher than any smartphone glass. And a bright, beautiful OLED display", R.drawable.iphone12))
        dataList.add(HomeDataModel("Vivo Y20", "Android 10, Funtouch 10.5 · 64GB storage", R.drawable.vivo_y20))
        dataList.add(HomeDataModel("Samsung m30s", "(Black, 128 GB) (6 GB RAM) · 6 GB RAM  128 GB ROM ", R.drawable.samsungm30s))
        dataList.add(HomeDataModel("iPhone 12", "A super-powerful chip. An advanced dual‑camera system. A Ceramic Shield front that's tougher than any smartphone glass. And a bright, beautiful OLED display", R.drawable.iphone12))
        dataList.add(HomeDataModel("Vivo Y20", "Android 10, Funtouch 10.5 · 64GB storage", R.drawable.vivo_y20))
        dataList.add(HomeDataModel("Samsung m30s", "(Black, 128 GB) (6 GB RAM) · 6 GB RAM  128 GB ROM ", R.drawable.samsungm30s))
        dataList.add(HomeDataModel("iPhone 12", "A super-powerful chip. An advanced dual‑camera system. A Ceramic Shield front that's tougher than any smartphone glass. And a bright, beautiful OLED display", R.drawable.iphone12))
        dataList.add(HomeDataModel("Vivo Y20", "Android 10, Funtouch 10.5 · 64GB storage", R.drawable.vivo_y20))
        dataList.add(HomeDataModel("Samsung m30s", "(Black, 128 GB) (6 GB RAM) · 6 GB RAM  128 GB ROM ", R.drawable.samsungm30s))
        dataList.add(HomeDataModel("iPhone 12", "A super-powerful chip. An advanced dual‑camera system. A Ceramic Shield front that's tougher than any smartphone glass. And a bright, beautiful OLED display", R.drawable.iphone12))
        dataList.add(HomeDataModel("Vivo Y20", "Android 10, Funtouch 10.5 · 64GB storage", R.drawable.vivo_y20))
        dataList.add(HomeDataModel("Samsung m30s", "(Black, 128 GB) (6 GB RAM) · 6 GB RAM  128 GB ROM ", R.drawable.samsungm30s))
        dataList.add(HomeDataModel("iPhone 12", "A super-powerful chip. An advanced dual‑camera system. A Ceramic Shield front that's tougher than any smartphone glass. And a bright, beautiful OLED display", R.drawable.iphone12))
        dataList.add(HomeDataModel("Vivo Y20", "Android 10, Funtouch 10.5 · 64GB storage", R.drawable.vivo_y20))
        dataList.add(HomeDataModel("Samsung m30s", "(Black, 128 GB) (6 GB RAM) · 6 GB RAM  128 GB ROM ", R.drawable.samsungm30s))
        dataList.add(HomeDataModel("iPhone 12", "A super-powerful chip. An advanced dual‑camera system. A Ceramic Shield front that's tougher than any smartphone glass. And a bright, beautiful OLED display", R.drawable.iphone12))
        dataList.add(HomeDataModel("Vivo Y20", "Android 10, Funtouch 10.5 · 64GB storage", R.drawable.vivo_y20))
        dataList.add(HomeDataModel("Samsung m30s", "(Black, 128 GB) (6 GB RAM) · 6 GB RAM  128 GB ROM ", R.drawable.samsungm30s))
        dataList.add(HomeDataModel("iPhone 12", "A super-powerful chip. An advanced dual‑camera system. A Ceramic Shield front that's tougher than any smartphone glass. And a bright, beautiful OLED display", R.drawable.iphone12))
        dataList.add(HomeDataModel("Vivo Y20", "Android 10, Funtouch 10.5 · 64GB storage", R.drawable.vivo_y20))
        value = dataList
    }
    val homeDataList: LiveData<MutableList<HomeDataModel>> = _homeDataList
}