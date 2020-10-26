package model

class Camera {

    private var isOn: Boolean = false
    private var resolution: Int = 640

    fun setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int {
        return this.resolution
    }

    fun turnOn() {
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getcameraStatus(): String {
        return if (isOn) "Camera is Turned" else "Camera is not Turned"
    }

    /*fun setcameraStatus(onoff: Boolean) {
        return isOn = onoff
    }*/

}