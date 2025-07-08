
import streamlit as st
import numpy as np
import tensorflow as tf
import matplotlib.pyplot as plt
from PIL import Image
from utils.gradcam import get_gradcam_heatmap

@st.cache_resource
def load_model():
    model = tf.keras.models.load_model("model/efficientnet_model.h5")
    return model

model = load_model()

st.title("🩺 Medical Image Classifier (Pneumonia / COVID)")

uploaded_file = st.file_uploader("Upload a chest X-ray image", type=["jpg", "png", "jpeg"])

if uploaded_file is not None:
    image = Image.open(uploaded_file).convert("RGB")
    st.image(image, caption="Uploaded X-ray", use_column_width=True)
    img_array = np.array(image.resize((224,224)))/255.0
    img_array = np.expand_dims(img_array, axis=0)
    prediction = model.predict(img_array)[0]
    class_idx = np.argmax(prediction)
    classes = ["Normal", "Pneumonia", "COVID-19"]
    confidence = prediction[class_idx]
    st.subheader(f"Prediction: **{classes[class_idx]}**")
    st.write(f"Confidence: **{confidence:.2f}**")
    heatmap = get_gradcam_heatmap(model, img_array, class_idx)
    fig, ax = plt.subplots()
    ax.imshow(image, alpha=0.6)
    ax.imshow(heatmap, cmap='jet', alpha=0.4)
    ax.axis('off')
    st.pyplot(fig)
