import SwiftUI
import SharedUI

@main
struct ComposeApp: App {
    init() {
        NativeBridgesKt.registerNativeCalendarFactory { onDateSelected in
            let view = NativeCalendarView(onChange: onDateSelected)
            return UIHostingController(rootView: view)
        }

        KoinIOSKt.doInitKoinIos()
    }

    var body: some Scene {
        WindowGroup {
            ContentView().ignoresSafeArea(.all)
        }
    }
}

struct ContentView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        MainKt.MainViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {

    }
}

struct NativeCalendarView: View {
    @State private var date = Date()
    let onChange: (KotlinLong) -> KotlinUnit

    var body: some View {
        VStack {
            DatePicker("Date", selection: $date, displayedComponents: [.date])
                .datePickerStyle(.graphical)
                .labelsHidden()
                .padding()
                .background(
                    RoundedRectangle(cornerRadius: 20)
                        .fill(Color(.systemBackground))
                        .shadow(radius: 8)
                )
                .accentColor(.purple)
                .scaleEffect(1.05)
                .onChange(of: date) { newValue in
                    let millis = Int64(newValue.timeIntervalSince1970 * 1000)
                    _ = onChange(KotlinLong(longLong: millis))
                }
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        .background(Color(.secondarySystemBackground))
    }
}
