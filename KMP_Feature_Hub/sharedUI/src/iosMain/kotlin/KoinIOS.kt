import androidx.room.RoomDatabase
import com.kognitivist.app.data.AppDatabase
import com.kognitivist.app.initKoin
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
