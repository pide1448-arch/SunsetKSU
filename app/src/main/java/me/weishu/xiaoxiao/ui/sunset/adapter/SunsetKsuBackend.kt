package me.weishu.xiaoxiao.ui.sunset.adapter

import me.weishu.xiaoxiao.Natives

/**
 * 落日余晖后端桥接。
 *
 * UI：
 * FolkPatch
 *
 * Backend：
 * KernelSU
 *
 * 不包含：
 * APatch
 * KernelPatch
 * APM
 * KPM
 */
object SunsetKsuBackend {

    fun isKernelSU(): Boolean {
        return true
    }

    fun kernelVersion(): Int {
        return runCatching {
            Natives.version
        }.getOrDefault(0)
    }

    fun isSafeMode(): Boolean {
        return runCatching {
            Natives.isSafeMode
        }.getOrDefault(false)
    }

    fun isLkmMode(): Boolean {
        return runCatching {
            Natives.isLkmMode
        }.getOrDefault(false)
    }
}
