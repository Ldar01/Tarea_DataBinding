package com.example.tarea_nextor_ejemplo14

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {

    private val _scoreTeamA = MutableLiveData<Team>()
    val teamA: LiveData<Team>
    get() = _scoreTeamA

    private val _scoreTeamB = MutableLiveData<Team>()
    val teamB: LiveData<Team>
    get() = _scoreTeamB

    init {
        _scoreTeamA.value?.name = "Team A"
        _scoreTeamA.value?.score = 0
        _scoreTeamB.value?.name = "Team B"
        _scoreTeamB.value?.score = 0
    }


    fun AddOneTeamA(){
        _scoreTeamB.value?.score = _scoreTeamB.value?.score?.plus(1)!!
    }

    fun AddOneTeamB(){
        _scoreTeamB.value?.score = _scoreTeamB.value?.score?.plus(1)!!
    }

    fun AddTwoTeamA(){
        _scoreTeamB.value?.score = _scoreTeamB.value?.score?.plus(2)!!
    }

    fun AddTwoTeamB(){
        _scoreTeamB.value?.score = _scoreTeamB.value?.score?.plus(2)!!
    }

    fun AddThreeTeamA(){
        _scoreTeamB.value?.score = _scoreTeamB.value?.score?.plus(3)!!
    }

    fun AddThreeTeamB(){
        _scoreTeamB.value?.score = _scoreTeamB.value?.score?.plus(3)!!
    }

    fun ResetScores(){
        _scoreTeamA.value?.score = 0
        _scoreTeamB.value?.score = 0
    }
}