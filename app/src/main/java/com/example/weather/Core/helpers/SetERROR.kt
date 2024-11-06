package com.example.weather.Core.helpers

import com.example.weather.Core.utils.ExceptionDescr
import com.example.weather.Core.utils.ExceptionTiles

object SetError {
    fun SetError(errorTittle : String): String {
        return when(errorTittle) {
            ExceptionTiles.GPS_Disabled -> ExceptionDescr.GPS_DEsc
            ExceptionTiles.NO_Internet -> ExceptionDescr.NO_Internt_Desc
            ExceptionTiles.No_Permisson -> ExceptionDescr.No_permi_DESC
            else -> ExceptionDescr.Unkown_Desc
        }
    }
}