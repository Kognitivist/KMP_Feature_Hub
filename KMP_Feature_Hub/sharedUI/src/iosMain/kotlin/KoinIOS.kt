import androidx.room.RoomDatabase
import com.kognitivist.app.initKoin
import com.kognitivist.common_features.dataBaseRoom.data.AppDatabase
import org.koin.dsl.module

fun doInitKoinIos() = initKoin {
    modules(
        module {
            single<RoomDatabase.Builder<AppDatabase>> {
                getDatabaseBuilder()
            }
        }
    )
}
