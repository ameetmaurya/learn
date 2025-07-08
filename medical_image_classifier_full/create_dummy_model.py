
import tensorflow as tf
import os

# Make sure the model directory exists
os.makedirs("model", exist_ok=True)

# Create a dummy EfficientNetB0 with 3 output classes
model = tf.keras.applications.EfficientNetB0(
    input_shape=(224, 224, 3),
    weights=None,    # No pretraining, just for testing
    classes=3
)

model.compile(optimizer="adam", loss="categorical_crossentropy")
model.save("model/efficientnet_model.h5")

print("✅ Dummy EfficientNet model saved to model/efficientnet_model.h5")
