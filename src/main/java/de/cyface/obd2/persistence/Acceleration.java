/*
 * Created on 07.09.16 at 07:45.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.cyface.obd2.persistence;

/**
 * <p>
 * A class representing one accelerometer data point.
 * </p>
 *
 * @author Klemens Muthmann
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Acceleration {
    /**
     * <p>
     * Acceleration in device local x direction.
     * </p>
     */
    private final int ax;
    /**
     * <p>
     * Acceleration in device local y direction.
     * </p>
     */
    private final int ay;
    /**
     * <p>
     * Acceleration in device local z direction.
     * </p>
     */
    private final int az;

    /**
     * <p>
     * Creates a new completely initialized object. This is a read only object so all attributes are initialized via its
     * constructor.
     * </p>
     *
     * @param ax Acceleration in device local x direction.
     * @param ay Acceleration in device local y direction.
     * @param az Acceleration in device local z direction.
     */
    Acceleration(final int ax, final int ay, final int az) {
        this.ax = ax;
        this.ay = ay;
        this.az = az;
    }

    /**
     * @return Acceleration in device local x direction.
     */
    public int getAx() {
        return ax;
    }

    /**
     * @return Acceleration in device local y direction.
     */
    public int getAy() {
        return ay;
    }

    /**
     * @return Acceleration in device local z direction.
     */
    public int getAz() {
        return az;
    }
}
