package by.kos.simplenotes.utils

import by.kos.simplenotes.MainActivity
import by.kos.simplenotes.database.DatabaseRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference

lateinit var APP_ACTIVITY: MainActivity
const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"
lateinit var REPOSITORY:DatabaseRepository
const val TYPE_FIREBASE = "type_firebase"
lateinit var EMAIL: String
lateinit var PASSWORD: String
const val ID_FIREBASE = "id_firebase"
const val NAME = "name"
const val TEXT = "text"
lateinit var AUTH: FirebaseAuth
lateinit var CURRENT_ID: String
lateinit var REF_DATABASE: DatabaseReference
